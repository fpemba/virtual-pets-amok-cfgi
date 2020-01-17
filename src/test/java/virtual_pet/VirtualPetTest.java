package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void shouldInstantiate() {
        VirtualPet pet = new VirtualPet();
    }

    @Test
    public void shouldSayTheirName() {
        VirtualPet pet = new VirtualPet();

        String result = pet.getName();

        assertEquals("John", result);
    }

    @Test
    public void shouldHaveTenHunger() {
        VirtualPet pet = new VirtualPet();

        int result = pet.getHunger();

        assertEquals(10, result);
    }

    @Test
    public void shouldSayTheirFeelings() {
        VirtualPet pet = new VirtualPet();

        String result = pet.getFeelings();

        assertEquals("Happy", result);
    }

    @Test
    public void shouldHaveDefaultHappiness() {
        VirtualPet pet = new VirtualPet();

        int result = pet.getHappiness();

        assertEquals(50, result);
    }

    @Test
    public void shouldHaveDefaultColor() {
        VirtualPet pet = new VirtualPet();

        String result = pet.getColor();

        assertEquals("Brown", result);
    }

    @Test
    public void shouldHaveDefaultAge() {
        VirtualPet pet = new VirtualPet();

        int result = pet.getAge();

        assertEquals(2, result);
    }
}
