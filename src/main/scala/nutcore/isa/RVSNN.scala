/**************************************************************************************
* Copyright (c) 2020 Institute of Computing Technology, CAS
* Copyright (c) 2020 University of Chinese Academy of Sciences
* 
* NutShell is licensed under Mulan PSL v2.
* You can use this software according to the terms and conditions of the Mulan PSL v2. 
* You may obtain a copy of Mulan PSL v2 at:
*             http://license.coscl.org.cn/MulanPSL2 
* 
* THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND, EITHER 
* EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT, MERCHANTABILITY OR 
* FIT FOR A PARTICULAR PURPOSE.  
*
* See the Mulan PSL v2 for more details.  
***************************************************************************************/

package nutcore

import chisel3._
import chisel3.util._

object RVSNNInstr extends  HasInstrType{
    def ANDS    = BitPat("b0000000_?????_?????_000_?????_0001011")
    def SGE     = BitPat("b0000001_?????_?????_000_?????_0001011")
    def RPOP    = BitPat("b0000000_00000_?????_001_?????_0001011")
    def SLS     = BitPat("b0000001_00000_?????_001_?????_0001011")
    def DRD     = BitPat("b0000010_00000_?????_001_?????_0001011")
    def SUP     = BitPat("b0000011_00000_?????_001_?????_0001011")
    def NADD    = BitPat("b???????_?????_?????_010_?????_0001011")
    def NST     = BitPat("b???????_?????_?????_011_?????_0001011")
    def SST     = BitPat("b???????_?????_?????_100_?????_0001011")
    def NLD     = BitPat("b????????????_?????_101_?????_0001011")
    def SLD     = BitPat("b????????????_?????_110_?????_0001011")
    def SINIT   = BitPat("b??????_?_?????_?????_111_?????_0001011")

    val table = Array(
        ANDS        -> List(InstrS,   FuType.snn,   SNNOpType.ands),
        SGE         -> List(InstrS,   FuType.snn,   SNNOpType.sge),
        RPOP        -> List(InstrSNN,   FuType.snn,   SNNOpType.rpop),
        SLS         -> List(InstrSNN,   FuType.snn,   SNNOpType.sls),
        DRD         -> List(InstrSNN,   FuType.snn,   SNNOpType.drd),
        SUP         -> List(InstrSNN,   FuType.snn,   SNNOpType.sup),
        NADD        -> List(InstrS,   FuType.snn,   SNNOpType.nadd),
        NST         -> List(InstrS,   FuType.snn,   SNNOpType.nst),
        SST         -> List(InstrS,   FuType.snn,   SNNOpType.sst),
        NLD         -> List(InstrI,   FuType.snn,   SNNOpType.nld),
        SLD         -> List(InstrI,   FuType.snn,   SNNOpType.sld),
        SINIT       -> List(InstrI,   FuType.snn,   SNNOpType.sinit)
    )
}