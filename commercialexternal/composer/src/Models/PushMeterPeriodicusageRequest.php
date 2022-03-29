<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIALEXTERNAL\Models;

use AlibabaCloud\Tea\Model;

class PushMeterPeriodicusageRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 计量域编码
    /**
     * @var string
     */
    public $domainCode;

    // 规格编码
    /**
     * @var string
     */
    public $specCode;

    //
    // 资源编码
    /**
     * @var string
     */
    public $resourceCode;

    // 规格实例id
    /**
     * @var string
     */
    public $specInstanceId;

    // 计量数据，json string格式字符串
    /**
     * @var string
     */
    public $data;

    // 计量数据对应的发生周期开始时间yyyyMMddHHmmss格式
    /**
     * @var string
     */
    public $gmtMeterBegin;

    // 计量数据对应的发生周期开始时间yyyyMMddHHmmss格式
    /**
     * @var string
     */
    public $gmtMeterEnd;
    protected $_name = [
        'authToken'      => 'auth_token',
        'domainCode'     => 'domain_code',
        'specCode'       => 'spec_code',
        'resourceCode'   => 'resource_code',
        'specInstanceId' => 'spec_instance_id',
        'data'           => 'data',
        'gmtMeterBegin'  => 'gmt_meter_begin',
        'gmtMeterEnd'    => 'gmt_meter_end',
    ];

    public function validate()
    {
        Model::validateRequired('domainCode', $this->domainCode, true);
        Model::validateRequired('specCode', $this->specCode, true);
        Model::validateRequired('resourceCode', $this->resourceCode, true);
        Model::validateRequired('specInstanceId', $this->specInstanceId, true);
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('gmtMeterBegin', $this->gmtMeterBegin, true);
        Model::validateRequired('gmtMeterEnd', $this->gmtMeterEnd, true);
        Model::validateMaxLength('domainCode', $this->domainCode, 128);
        Model::validateMaxLength('specCode', $this->specCode, 128);
        Model::validateMaxLength('resourceCode', $this->resourceCode, 128);
        Model::validateMaxLength('specInstanceId', $this->specInstanceId, 128);
        Model::validateMinLength('domainCode', $this->domainCode, 1);
        Model::validateMinLength('specCode', $this->specCode, 1);
        Model::validateMinLength('resourceCode', $this->resourceCode, 1);
        Model::validateMinLength('specInstanceId', $this->specInstanceId, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->domainCode) {
            $res['domain_code'] = $this->domainCode;
        }
        if (null !== $this->specCode) {
            $res['spec_code'] = $this->specCode;
        }
        if (null !== $this->resourceCode) {
            $res['resource_code'] = $this->resourceCode;
        }
        if (null !== $this->specInstanceId) {
            $res['spec_instance_id'] = $this->specInstanceId;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->gmtMeterBegin) {
            $res['gmt_meter_begin'] = $this->gmtMeterBegin;
        }
        if (null !== $this->gmtMeterEnd) {
            $res['gmt_meter_end'] = $this->gmtMeterEnd;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushMeterPeriodicusageRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['domain_code'])) {
            $model->domainCode = $map['domain_code'];
        }
        if (isset($map['spec_code'])) {
            $model->specCode = $map['spec_code'];
        }
        if (isset($map['resource_code'])) {
            $model->resourceCode = $map['resource_code'];
        }
        if (isset($map['spec_instance_id'])) {
            $model->specInstanceId = $map['spec_instance_id'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['gmt_meter_begin'])) {
            $model->gmtMeterBegin = $map['gmt_meter_begin'];
        }
        if (isset($map['gmt_meter_end'])) {
            $model->gmtMeterEnd = $map['gmt_meter_end'];
        }

        return $model;
    }
}
