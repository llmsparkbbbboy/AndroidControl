/*
 *
 * MIT License
 *
 * Copyright (c) 2017 朱辉 https://blog.yeetor.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.yeetor.server;

import com.yeetor.adb.AdbDevice;
import com.yeetor.adb.AdbServer;
import com.yeetor.minicap.ScreencapBase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ScreencapService extends HashMap<AdbDevice, ScreencapBase> {
    
    public List<ScreencapBase> filterWithDevice(AdbDevice device) {
        List<ScreencapBase> lst = new LinkedList<>();
        Iterator iter = entrySet().iterator();
        
        while (iter.hasNext()) {
            Entry entry = (Entry) iter.next();

            AdbDevice key = (AdbDevice) entry.getKey();
            if (key.equals(device)) {
                lst.add((ScreencapBase) entry.getValue());
            }
        }
        return lst;
    }
    
    
    
}
