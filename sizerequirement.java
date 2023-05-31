package girish.encapsulation.deficient.after;

public class SizeRequirement {
    private float alignment;

    public SizeRequirement(float alignment) {
        setAlignment(alignment);
    }

    public float getAlignment() {
        return alignment;
    }

    public void setAlignment(float alignment) {
        if (isValidAlignment(alignment)) {
            this.alignment = alignment;
        } else {
            throw new IllegalArgumentException("Alignment must be between 0.0 and 1.0 inclusive.");
        }
    }

    private boolean isValidAlignment(float alignment) {
        return alignment >= 0.0f && alignment <= 1.0f;
    }
}