<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class MonitoryAggregationVO extends Model
{
    // invoke_num
    /**
     * @example
     *
     * @var MonitorData[]
     */
    public $invokeNum;

    // qps
    /**
     * @example
     *
     * @var MonitorData[]
     */
    public $qps;

    // rt
    /**
     * @example
     *
     * @var MonitorData[]
     */
    public $rt;

    // 错误码
    /**
     * @example
     *
     * @var MonitorData[]
     */
    public $errCode;

    // 错误率
    /**
     * @example
     *
     * @var MonitorData[]
     */
    public $errRate;

    // byte_in
    /**
     * @example
     *
     * @var MonitorData[]
     */
    public $byteIn;

    // byte_out
    /**
     * @example
     *
     * @var MonitorData[]
     */
    public $byteOut;
    protected $_name = [
        'invokeNum' => 'invoke_num',
        'qps'       => 'qps',
        'rt'        => 'rt',
        'errCode'   => 'err_code',
        'errRate'   => 'err_rate',
        'byteIn'    => 'byte_in',
        'byteOut'   => 'byte_out',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->invokeNum) {
            $res['invoke_num'] = [];
            if (null !== $this->invokeNum && \is_array($this->invokeNum)) {
                $n = 0;
                foreach ($this->invokeNum as $item) {
                    $res['invoke_num'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->qps) {
            $res['qps'] = [];
            if (null !== $this->qps && \is_array($this->qps)) {
                $n = 0;
                foreach ($this->qps as $item) {
                    $res['qps'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->rt) {
            $res['rt'] = [];
            if (null !== $this->rt && \is_array($this->rt)) {
                $n = 0;
                foreach ($this->rt as $item) {
                    $res['rt'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->errCode) {
            $res['err_code'] = [];
            if (null !== $this->errCode && \is_array($this->errCode)) {
                $n = 0;
                foreach ($this->errCode as $item) {
                    $res['err_code'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->errRate) {
            $res['err_rate'] = [];
            if (null !== $this->errRate && \is_array($this->errRate)) {
                $n = 0;
                foreach ($this->errRate as $item) {
                    $res['err_rate'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->byteIn) {
            $res['byte_in'] = [];
            if (null !== $this->byteIn && \is_array($this->byteIn)) {
                $n = 0;
                foreach ($this->byteIn as $item) {
                    $res['byte_in'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->byteOut) {
            $res['byte_out'] = [];
            if (null !== $this->byteOut && \is_array($this->byteOut)) {
                $n = 0;
                foreach ($this->byteOut as $item) {
                    $res['byte_out'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MonitoryAggregationVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['invoke_num'])) {
            if (!empty($map['invoke_num'])) {
                $model->invokeNum = [];
                $n                = 0;
                foreach ($map['invoke_num'] as $item) {
                    $model->invokeNum[$n++] = null !== $item ? MonitorData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['qps'])) {
            if (!empty($map['qps'])) {
                $model->qps = [];
                $n          = 0;
                foreach ($map['qps'] as $item) {
                    $model->qps[$n++] = null !== $item ? MonitorData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['rt'])) {
            if (!empty($map['rt'])) {
                $model->rt = [];
                $n         = 0;
                foreach ($map['rt'] as $item) {
                    $model->rt[$n++] = null !== $item ? MonitorData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['err_code'])) {
            if (!empty($map['err_code'])) {
                $model->errCode = [];
                $n              = 0;
                foreach ($map['err_code'] as $item) {
                    $model->errCode[$n++] = null !== $item ? MonitorData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['err_rate'])) {
            if (!empty($map['err_rate'])) {
                $model->errRate = [];
                $n              = 0;
                foreach ($map['err_rate'] as $item) {
                    $model->errRate[$n++] = null !== $item ? MonitorData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['byte_in'])) {
            if (!empty($map['byte_in'])) {
                $model->byteIn = [];
                $n             = 0;
                foreach ($map['byte_in'] as $item) {
                    $model->byteIn[$n++] = null !== $item ? MonitorData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['byte_out'])) {
            if (!empty($map['byte_out'])) {
                $model->byteOut = [];
                $n              = 0;
                foreach ($map['byte_out'] as $item) {
                    $model->byteOut[$n++] = null !== $item ? MonitorData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
