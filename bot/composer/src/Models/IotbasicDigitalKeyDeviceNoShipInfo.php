<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotbasicDigitalKeyDeviceNoShipInfo extends Model
{
    // 设备id
    /**
     * @example 125839
     *
     * @var string
     */
    public $devid;

    // 设备sn
    /**
     * @example 9726001010008SC30N96
     *
     * @var string
     */
    public $sn;

    // ccid
    /**
     * @example 898602B1191870002179
     *
     * @var string
     */
    public $ccid;

    // imei
    /**
     * @example 866311069827503
     *
     * @var string
     */
    public $imei;

    // tbox固件版本号(16进制)
    /**
     * @example 80000109
     *
     * @var string
     */
    public $ver;

    // PEPS系统固件版本号(16进制)
    /**
     * @example 81070205
     *
     * @var string
     */
    public $pepsVer;

    // 蓝牙固件版本号(16进制)
    /**
     * @example 80090204
     *
     * @var string
     */
    public $bleVer;
    protected $_name = [
        'devid'   => 'devid',
        'sn'      => 'sn',
        'ccid'    => 'ccid',
        'imei'    => 'imei',
        'ver'     => 'ver',
        'pepsVer' => 'peps_ver',
        'bleVer'  => 'ble_ver',
    ];

    public function validate()
    {
        Model::validateRequired('devid', $this->devid, true);
        Model::validateRequired('sn', $this->sn, true);
        Model::validateRequired('ccid', $this->ccid, true);
        Model::validateRequired('imei', $this->imei, true);
        Model::validateRequired('ver', $this->ver, true);
        Model::validateRequired('pepsVer', $this->pepsVer, true);
        Model::validateRequired('bleVer', $this->bleVer, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->devid) {
            $res['devid'] = $this->devid;
        }
        if (null !== $this->sn) {
            $res['sn'] = $this->sn;
        }
        if (null !== $this->ccid) {
            $res['ccid'] = $this->ccid;
        }
        if (null !== $this->imei) {
            $res['imei'] = $this->imei;
        }
        if (null !== $this->ver) {
            $res['ver'] = $this->ver;
        }
        if (null !== $this->pepsVer) {
            $res['peps_ver'] = $this->pepsVer;
        }
        if (null !== $this->bleVer) {
            $res['ble_ver'] = $this->bleVer;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotbasicDigitalKeyDeviceNoShipInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['devid'])) {
            $model->devid = $map['devid'];
        }
        if (isset($map['sn'])) {
            $model->sn = $map['sn'];
        }
        if (isset($map['ccid'])) {
            $model->ccid = $map['ccid'];
        }
        if (isset($map['imei'])) {
            $model->imei = $map['imei'];
        }
        if (isset($map['ver'])) {
            $model->ver = $map['ver'];
        }
        if (isset($map['peps_ver'])) {
            $model->pepsVer = $map['peps_ver'];
        }
        if (isset($map['ble_ver'])) {
            $model->bleVer = $map['ble_ver'];
        }

        return $model;
    }
}
