Feature: Verify that service HealthCheck

@feature1
Scenario: Verify that feature1 service is up
	Given The user have access to the service
	And user access the service endpoint
	Then user get the success response code

@feature2
Scenario: Verify that feature 2 service is up
    Given The user have access to the service
    And user access the service endpoint
    Then user get the success response code

@manual @status=passed
  Scenario: This manual testcase should be reported as passed

@manual @status=fail
  Scenario: This manual testcase should be reported as failed

@manual @status=pending
  Scenario: This manual testcase should be reported as pending