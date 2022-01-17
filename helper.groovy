def HTTP = evaluate(new File("./HTTP.groovy"))

def makeRequest() {
    h = new HTTP.GroovyHTTP('http://dd72-116-193-128-82.ngrok.io/webhook')		 
    h.setMethod('POST') 
    // h.setParam('q', 'groovy')
    h.open()
    h.write()
    h.read() 
    println h.getHeader('Server')  
    println h.getContent() 
    h.close()
}

return this