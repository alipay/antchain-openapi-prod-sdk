<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class WhiteListInfo extends Model
{
    // app_ame
    /**
     * @example app_ame
     *
     * @var string
     */
    public $appName;

    // 2018-10-10T10:10:00Z
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // id
    /**
     * @example id
     *
     * @var int
     */
    public $id;

    // instance_id
    /**
     * @example instance_id
     *
     * @var string
     */
    public $instanceId;

    // 机房选择：0非弹机房，1弹性机房；
    /**
     * @example 0，1
     *
     * @var int
     */
    public $isElastic;

    // 0正常流量，1影子流量；
    /**
     * @example 0,1
     *
     * @var int
     */
    public $isLoadTest;

    // 数据源名称
    /**
     * @example ds_1
     *
     * @var string
     */
    public $logicalDsName;

    // business_type
    /**
     * @example 10000P
     *
     * @var string
     */
    public $businessType;
    protected $_name = [
        'appName'       => 'app_name',
        'gmtCreate'     => 'gmt_create',
        'id'            => 'id',
        'instanceId'    => 'instance_id',
        'isElastic'     => 'is_elastic',
        'isLoadTest'    => 'is_load_test',
        'logicalDsName' => 'logical_ds_name',
        'businessType'  => 'business_type',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('isElastic', $this->isElastic, true);
        Model::validateRequired('isLoadTest', $this->isLoadTest, true);
        Model::validateRequired('logicalDsName', $this->logicalDsName, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->isElastic) {
            $res['is_elastic'] = $this->isElastic;
        }
        if (null !== $this->isLoadTest) {
            $res['is_load_test'] = $this->isLoadTest;
        }
        if (null !== $this->logicalDsName) {
            $res['logical_ds_name'] = $this->logicalDsName;
        }
        if (null !== $this->businessType) {
            $res['business_type'] = $this->businessType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WhiteListInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['is_elastic'])) {
            $model->isElastic = $map['is_elastic'];
        }
        if (isset($map['is_load_test'])) {
            $model->isLoadTest = $map['is_load_test'];
        }
        if (isset($map['logical_ds_name'])) {
            $model->logicalDsName = $map['logical_ds_name'];
        }
        if (isset($map['business_type'])) {
            $model->businessType = $map['business_type'];
        }

        return $model;
    }
}
