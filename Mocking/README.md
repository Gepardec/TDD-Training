#Mocking

**What is mocking?**
 * Mocking is used in (unit-)testing
 * To mock: to replace with an imitation
 * To simulate behavior of real things
 
**Why mock?**
 * Code to be tested has dependencies to other (complex) objects
 * Isolate behavior
 * To increase performance (e.g. mock method that creates a file to increase test performance)
 * To make test-scenarios easier to implement (actual error codes are often hard to force)
 
**Drawbacks of mocking:**
 * Mocks have to evolve with the real functionality (e.g. mocks have to be changed after bugfix) - a lot of refactoring 
 * Mocking often leads to code duplication
 * Mocken can complicate the design of the software (not as much thought has to be put into code design since dependencies do not matter when mocking excessively)

**Mocking-Types:**
 * Stubbing – simulate (only mock behavior – e.g. replace DB with some kind of in-memory-structure)
 * Mocking – simulate and verify (mock the whole object – e.g create mocking-DB and verify DB state)
 
**Proxy based Mocking:**
 * Mockito, EasyMock
 * Create Proxy object
 * On method call of object -> proxy object either calls real or mocked method
 * Restrictions: not mocking of private and/or static and/or final methods/classes
 
**Classloader remapping based Mocking:**
 * PowerMock
 * Create Mock class
 * Whole class can be mocked since classloader is told to remap to mock class(also private, static, final things)

**Sample Project:**
 * https://github.com/in28minutes/MockitoTutorialForBeginners
 
**Notes:**
 * Mocking in integration-testing should be used on service you have no control over

**TBD:**
 * mocking in a microservice architecture (https://circleci.com/blog/how-to-test-software-part-i-mocking-stubbing-and-contract-testing/)
