package com.example.demo.invite.cdc;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.MessageVerifier;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.DemoApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE , classes=DemoApplication.class)
//@TestConfiguration
//@TestPropertySource(locations = "test.properties")
@AutoConfigureMessageVerifier
public abstract class ConsumerMessagingBase {

	@Inject
	MessageVerifier messaging;
	
//	@Autowired
//	InviteService inviteService;
	
	@Before
	public void setUp() {
		// clear out remaning messages
//		messaging.receive("payee_invites",100,TimeUnit.MILLISECONDS)
		
	}
	
	
	public void consumerInvited() {
		// TODO: this should trigger a message	
	}
	
	
}
