package com.exception

import java.io.{FileNotFoundException, FileReader, IOException}

object Test {
  def main(args: Array[String]) {
    try {
      //val f = new FileReader("input.txt")
      throw new NullPointerException
    } catch {
      case ex: FileNotFoundException => {
        println("in FileNotFoundException")
      }
      case ex: NullPointerException=>{
        println("in NullPointerException")
      }
      case ex: IOException => {
        println("in IO Exception")
      }
    } finally {
      println("in finally...")
    }
  }
}
