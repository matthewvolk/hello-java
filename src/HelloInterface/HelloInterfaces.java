package HelloInterface;
// The Java term of "interface" is quite restricted. Basically, any function declaration is an interface:
// void call_me(int times);

public interface HelloInterfaces {
	// Normally, interfaces are named as adjectives b/c most objects are 'nouns', and you modify nouns with adjectives.
	
	// ALL fields in an interface are FINAL
	double PI = 3.14;
	
	int getWheels();
	void setWheels(int numWheels);
	double getSpeed();
	void setSpeed(int speed);
	
}
