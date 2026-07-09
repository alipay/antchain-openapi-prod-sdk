<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotbasicDigitalKeyDeviceInfo extends Model
{
    // 设备id
    /**
     * @example 125839
     *
     * @var string
     */
    public $devid;

    // 设备名称
    /**
     * @example 867186033894659
     *
     * @var string
     */
    public $devName;

    // 设备sn
    /**
     * @example 9726001010008SC30N96
     *
     * @var string
     */
    public $sn;

    // Ccid
    /**
     * @example 898602B1191870002179
     *
     * @var string
     */
    public $ccid;

    // Msisdn
    /**
     * @example 1064818313682
     *
     * @var string
     */
    public $msisdn;

    // tbox固件版本号(16进制)
    /**
     * @example 80000109
     *
     * @var string
     */
    public $ver;
    protected $_name = [
        'devid'   => 'devid',
        'devName' => 'dev_name',
        'sn'      => 'sn',
        'ccid'    => 'ccid',
        'msisdn'  => 'msisdn',
        'ver'     => 'ver',
    ];

    public function validate()
    {
        Model::validateRequired('devid', $this->devid, true);
        Model::validateRequired('devName', $this->devName, true);
        Model::validateRequired('sn', $this->sn, true);
        Model::validateRequired('ccid', $this->ccid, true);
        Model::validateRequired('msisdn', $this->msisdn, true);
        Model::validateRequired('ver', $this->ver, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->devid) {
            $res['devid'] = $this->devid;
        }
        if (null !== $this->devName) {
            $res['dev_name'] = $this->devName;
        }
        if (null !== $this->sn) {
            $res['sn'] = $this->sn;
        }
        if (null !== $this->ccid) {
            $res['ccid'] = $this->ccid;
        }
        if (null !== $this->msisdn) {
            $res['msisdn'] = $this->msisdn;
        }
        if (null !== $this->ver) {
            $res['ver'] = $this->ver;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotbasicDigitalKeyDeviceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['devid'])) {
            $model->devid = $map['devid'];
        }
        if (isset($map['dev_name'])) {
            $model->devName = $map['dev_name'];
        }
        if (isset($map['sn'])) {
            $model->sn = $map['sn'];
        }
        if (isset($map['ccid'])) {
            $model->ccid = $map['ccid'];
        }
        if (isset($map['msisdn'])) {
            $model->msisdn = $map['msisdn'];
        }
        if (isset($map['ver'])) {
            $model->ver = $map['ver'];
        }

        return $model;
    }
}
