Feature: Select Query Execute

  Background: Database baglantisi kurar
    * Database baglantisi kurulur


@query01
  Scenario: Database içindeki "deposits" toblosunda "amount" değeri
            100$ ile 500$ arasında olan user_id'leri doğrulayınız.

    * Query01 hazirlanir ve execute edilir
    * ResultSet01 sonuclari islenir
    * Database baglantisi kapatilir

@query02
  Scenario: Database icindeki "cron-schedules" tablosunda ilk 2 kaydin
            "name" bilgisini doğrulayiniz
        #   test datalarimiz bize su sekilde verildi
        #   5 Minutes
        #   10 Minutes

    * Query02 hazirlanir ve execute edilir
    * ResultSet02 sonuclari islenir
    * Database baglantisi kapatilir

