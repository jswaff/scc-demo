package contracts.messaging


org.springframework.cloud.contract.spec.Contract.make {
	// label by means of which the output message can be triggered
	label 'consumer_invited'
	input {
		triggeredBy('consumerInvited()')
	}
	
	// output message of the contract
	outputMessage {
		// destination to which the output message will be sent
		sentTo 'consumer_invited'
		//body('''{ "bookName" : "foo" }''')
		body([:])
		//headers {
		//	header('BOOK-NAME', 'foo')
		//	messagingContentType(applicationJson())
		//}
	}
}
