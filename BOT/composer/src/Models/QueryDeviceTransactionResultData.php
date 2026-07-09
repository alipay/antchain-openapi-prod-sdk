<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryDeviceTransactionResultData extends Model
{
    // 设备所属厂商
    /**
     * @example corp
     *
     * @var string
     */
    public $corpName;

    // 场景码,所属项目
    /**
     * @example SMART_CAR_KEY
     *
     * @var string
     */
    public $scene;

    // IMEI
    /**
     * @example IMEI
     *
     * @var string
     */
    public $deviceImei;

    // 设备sn
    /**
     * @example 设备sn123
     *
     * @var string
     */
    public $deviceSn;

    // 设备金额
    /**
     * @example 1.05
     *
     * @var string
     */
    public $price;

    // 设备分布式身份did
    /**
     * @example did1223
     *
     * @var string
     */
    public $deviceDid;

    // 设备终端唯一ID
    /**
     * @example tuid123
     *
     * @var string
     */
    public $deviceTuid;

    // 设备参数:品类+型号+规格
    /**
     * @example 123
     *
     * @var string
     */
    public $deviceSpecs;

    // 所属租户
    /**
     * @example QWERTYUU
     *
     * @var string
     */
    public $tenantId;

    // 所属账号
    /**
     * @example 123
     *
     * @var string
     */
    public $accountName;
    protected $_name = [
        'corpName'    => 'corp_name',
        'scene'       => 'scene',
        'deviceImei'  => 'device_imei',
        'deviceSn'    => 'device_sn',
        'price'       => 'price',
        'deviceDid'   => 'device_did',
        'deviceTuid'  => 'device_tuid',
        'deviceSpecs' => 'device_specs',
        'tenantId'    => 'tenant_id',
        'accountName' => 'account_name',
    ];

    public function validate()
    {
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('deviceSn', $this->deviceSn, true);
        Model::validateRequired('deviceDid', $this->deviceDid, true);
        Model::validateRequired('deviceSpecs', $this->deviceSpecs, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('accountName', $this->accountName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->deviceImei) {
            $res['device_imei'] = $this->deviceImei;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->deviceTuid) {
            $res['device_tuid'] = $this->deviceTuid;
        }
        if (null !== $this->deviceSpecs) {
            $res['device_specs'] = $this->deviceSpecs;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDeviceTransactionResultData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['device_imei'])) {
            $model->deviceImei = $map['device_imei'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['price'])) {
            $model->price = $map['price'];
        }
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['device_tuid'])) {
            $model->deviceTuid = $map['device_tuid'];
        }
        if (isset($map['device_specs'])) {
            $model->deviceSpecs = $map['device_specs'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }

        return $model;
    }
}
