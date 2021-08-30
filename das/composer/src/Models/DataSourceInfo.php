<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class DataSourceInfo extends Model
{
    // 数据源ID
    /**
     * @example 1
     *
     * @var string
     */
    public $id;

    // 数据源名称
    /**
     * @example **数据
     *
     * @var string
     */
    public $name;

    // 数据提供方
    /**
     * @example ***有限公司
     *
     * @var string
     */
    public $provider;

    // 枚举值：ENTERPRISE、INDIVIDUAL
    /**
     * @example ENTERPRISE
     *
     * @var string
     */
    public $dataOwnerType;

    // 数据源接口信息
    /**
     * @example
     *
     * @var DataSourceInterface
     */
    public $dataSourceInterfaceInfo;
    protected $_name = [
        'id'                      => 'id',
        'name'                    => 'name',
        'provider'                => 'provider',
        'dataOwnerType'           => 'data_owner_type',
        'dataSourceInterfaceInfo' => 'data_source_interface_info',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('provider', $this->provider, true);
        Model::validateRequired('dataOwnerType', $this->dataOwnerType, true);
        Model::validateRequired('dataSourceInterfaceInfo', $this->dataSourceInterfaceInfo, true);
        Model::validateMaxLength('name', $this->name, 20);
        Model::validateMaxLength('provider', $this->provider, 30);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->provider) {
            $res['provider'] = $this->provider;
        }
        if (null !== $this->dataOwnerType) {
            $res['data_owner_type'] = $this->dataOwnerType;
        }
        if (null !== $this->dataSourceInterfaceInfo) {
            $res['data_source_interface_info'] = null !== $this->dataSourceInterfaceInfo ? $this->dataSourceInterfaceInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataSourceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['provider'])) {
            $model->provider = $map['provider'];
        }
        if (isset($map['data_owner_type'])) {
            $model->dataOwnerType = $map['data_owner_type'];
        }
        if (isset($map['data_source_interface_info'])) {
            $model->dataSourceInterfaceInfo = DataSourceInterface::fromMap($map['data_source_interface_info']);
        }

        return $model;
    }
}
