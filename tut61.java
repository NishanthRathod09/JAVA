// Life Cycle of the Thread

//                           notify()        sleep()/wait()
//                       <---------<-waiting<-------------<-
//     start()          ||         run()                  ||    stop()
// New------>------>Runnable--------->--------------->Running-->------->Dead
//                 ||                                               ||
//                  ------------->------------------------>-----------
//                                      stop()
