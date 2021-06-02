package org.example

class ArithmeticOperatorImpl : ArithmeticOperator {
        override fun operate(first_number: Int,second_number: Int,operator:String): String {
            var result = ""
            val items = listOf("ADD", "SUBTRACT", "MULTIPLY", "DIVIDE")
            var message = "Kindly enter correct operator"
            result = items.stream()
                .filter { item -> item.equals(operator,ignoreCase = true) }
                .findAny()
                .orElse(message)
            try {
                if (operator.equals("ADD", ignoreCase = true)) {
                    result = (first_number + second_number).toString()
                } else if (operator.equals("SUBTRACT", ignoreCase = true)) {
                    result = (first_number - second_number).toString()
                } else if (operator.equals("MULTIPLY", ignoreCase = true)) {
                    result = (first_number * second_number).toString()
                } else if (operator.equals("DIVIDE", ignoreCase = true)) {
                    result = (first_number / second_number).toString()
                }
            }
            catch (e: Exception) {
                result = "Invalid inputs"
            }
            return result
        }

}