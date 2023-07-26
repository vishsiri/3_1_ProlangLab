import re

def validate_input_format(input_str):
    # Regular expression pattern
    pattern = r'^-?\d+(\.\d+)?$'

    # Check if the input matches the pattern
    if re.match(pattern, input_str):
        return True
    else:
        return False

# Test cases
test_cases = ['35.00', '35.', '35.5', '35.35', '-35.00', '-1', '64.', '45.', '.35', '35.ab']

for test_case in test_cases:
    if validate_input_format(test_case):
        print(f"{test_case} is a valid input.")
    else:
        print(f"{test_case} is NOT a valid input.")
