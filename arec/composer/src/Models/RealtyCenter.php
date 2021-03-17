<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class RealtyCenter extends Model
{
    // 不动产中心地址
    /**
     * @example xx省xx市xx区xx路xxxx号
     *
     * @var string
     */
    public $address;

    // 不动产中心名称
    /**
     * @example xx市不动产中心
     *
     * @var string
     */
    public $name;

    // 外部不动产中心编号(不动产中心提供)
    /**
     * @example sbdsff23313131
     *
     * @var string
     */
    public $outRtcNo;

    // 蚂蚁链身份id
    /**
     * @example 668fa851746fdf358c5f96efe87d07178b49b17c143e06a659c368e83de2027e
     *
     * @var string
     */
    public $pdnDid;

    // 公钥
    /**
     * @example 668fa851746fdf358c5f96efe87d07178b49b17c143e06a659c368e83de2027e
     *
     * @var string
     */
    public $pubKey;

    // 不动产中心编号
    /**
     * @example 20200810001220040000000000000001
     *
     * @var string
     */
    public $rtcNo;
    protected $_name = [
        'address'  => 'address',
        'name'     => 'name',
        'outRtcNo' => 'out_rtc_no',
        'pdnDid'   => 'pdn_did',
        'pubKey'   => 'pub_key',
        'rtcNo'    => 'rtc_no',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->outRtcNo) {
            $res['out_rtc_no'] = $this->outRtcNo;
        }
        if (null !== $this->pdnDid) {
            $res['pdn_did'] = $this->pdnDid;
        }
        if (null !== $this->pubKey) {
            $res['pub_key'] = $this->pubKey;
        }
        if (null !== $this->rtcNo) {
            $res['rtc_no'] = $this->rtcNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RealtyCenter
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['out_rtc_no'])) {
            $model->outRtcNo = $map['out_rtc_no'];
        }
        if (isset($map['pdn_did'])) {
            $model->pdnDid = $map['pdn_did'];
        }
        if (isset($map['pub_key'])) {
            $model->pubKey = $map['pub_key'];
        }
        if (isset($map['rtc_no'])) {
            $model->rtcNo = $map['rtc_no'];
        }

        return $model;
    }
}
