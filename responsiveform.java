document.addEventListener('DOMContentLoaded', function() {
    // Form submission handling
    const signupForm = document.getElementById('workout-signup');
    
    if (signupForm) {
        signupForm.addEventListener('submit', function(e) {
            e.preventDefault();
            
            // Collect form data
            const formData = new FormData(signupForm);
            const formValues = {};
            
            for (let [key, value] of formData.entries()) {
                formValues[key] = value;
            }
            
            // Basic form validation
            const requiredFields = ['first-name', 'last-name', 'phone', 'email', 'workout-type'];
            let isValid = true;
            
            requiredFields.forEach(field => {
                const input = document.getElementById(field);
                if (!input.value.trim()) {
                    isValid = false;
                    input.style.borderColor = 'red';
                } else {
                    input.style.borderColor = '';
                }
            });
            
            if (isValid) {
                // Here you would typically send the data to a server
                alert('Form submitted successfully! We will contact you soon.');
                signupForm.reset();
            } else {
                alert('Please fill in all required fields.');
            }
        });
    }

    // Add hover effects and interactivity
    const cards = document.querySelectorAll('.card');
    cards.forEach(card => {
        card.addEventListener('mouseenter', function() {
            this.style.transform = 'scale(1.05)';
        });
        
        card.addEventListener('mouseleave', function() {
            this.style.transform = 'scale(1)';
        });
    });
});