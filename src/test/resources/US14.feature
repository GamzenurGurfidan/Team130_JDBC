Feature:

  Background: Database baglantisi kurar
    * Database baglantisi kurulur

  @US14
  Scenario Outline:

    * Query hazırlanır
    * alınan listede "<role>" ve <record_count> dogrulanir
    * Database baglantisi kapatilir
    Examples:
      | role         | record_count |
      | teacher      | 23           |
      | organization | 4            |

  @US03
  Scenario: gift tablosu data ekleme testi
    * insert query hazirlanir
    * 1 insert edildigi dogrulanir
    * Database baglantisi kapatilir


  @US08
  Scenario: authenticate the data with start_date
    * prepare query of the data with start_date in the webinars table
    * Verifies id 1996 the returned result
    * Database baglantisi kapatilir