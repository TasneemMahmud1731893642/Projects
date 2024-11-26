describe('template spec', () => {
  it('passes', () => {
    cy.visit('http://localhost:3000/')
    cy.get('#dd').should('contain.text','Notes app')
    cy.get('#gg').click()
    cy.get('#hh').click()
    cy.get("#title").type("31st jan")
    cy.get("#note").type("wow okay")
    cy.get("#auth").type("Taz")
    cy.get("#yy").select(3)
    cy.get('#bt').click()
    cy.get("#jj>#gi").eq(3).click()
    cy.get('#kk').click()
    
  })
  
  
})