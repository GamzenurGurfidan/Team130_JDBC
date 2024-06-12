

  Feature:

    Background: Database baglantisi kurar
      * Database baglantisi kurulur

    @US33
    Scenario: Verify the information of the webinar with the highest capacity from the webinars table and the full name of the teacher who created this webinar by retrieving it from the users table.
      * prepare query of data full_name in the users table with webinars table
      * Verifies name "Asher Morgan" the returned result
      * Database connection is closed