package org.example

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

class App : RequestHandler<HandlerInput, HandlerOutput> {
       val operator : ArithmeticOperator =ArithmeticOperatorImpl()

    override fun handleRequest(input: HandlerInput?, context: Context?): HandlerOutput {
        input?.let {
          return HandlerOutput(it.first_number,it.second_number
               , operator.operate(it.first_number,it.second_number,it.operator))
        }
       return HandlerOutput(0, 0,"");

    }
}
