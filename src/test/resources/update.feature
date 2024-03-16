Feature: Update Query

  Background: Database connection
    * Database baglantisi kurulur

    @UpdateQuery01

  Scenario: "users" tablosunda sondan bir önceki harfi e olan
            "usernamelerin" "mobile" numarasını update ediniz.

    * UpdateQuery01 olusturulur ve execute edilir
    * UpdateQuery01 sonuclari listelenir
    * Database baglantisi kapatilir

  @UpdateQuery02
  Scenario:  "users" tablosunda sondan bir önceki harfi e olan
             "usernamelerin" "mobile" numarasını update ediniz.

    * Prepared UpdateQuery01 olusturulur ve execute edilir
    * Prepared UpdateQuery01 sonuclari listelenir
    * Database baglantisi kapatilir

  @InsertQuery03
  Scenario: admin_password_resets tablosuna yeni (id,email,token,status,created_at datalarla)
              veri girisi yapiniz.

    * InsertQuery hazirlanir ve execute edilir
    * InsertQuery sonuclari dogrulanir
    * Database baglantisi kapatilir

  @DeleteQuery01
  Scenario: Update_logs tablosunda "id=?" degerine gore
            bir datayi siliniz ve silindigini dogrulayiniz

    * Delete Query hazirlanir ve execute edilir
    * Datanin silindigini dogrular
    * Database baglantisi kapatilir


@deleteQuery02
  Scenario:  "support_attachments" tablosunda "id=?"
             degerinde göre bir dosyayi siliniz ve silindigini dogrulayiniz.


    # bu sorguyu yapabilmek için özellikle projelerde
    # once kendimize ait bir veri olusturup sonra onu silmeliyiz

    * support_attachments tablosuna veri girilir
    * support_attachments tablosuna eklenen veri silinir
    * Verinin silindigi dogrulanir
    * Database baglantisi kapatilir
