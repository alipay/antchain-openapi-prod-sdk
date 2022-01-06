<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class SimpleServiceInfo extends Model
{
    // 服务id
    /**
     * @example cn.com.antcloud.guardianconsole.facade.configs.service.GuardianConfigFacade:1.0@DEFAULT
     *
     * @var string
     */
    public $dataId;

    // 服务提供者列表
    /**
     * @example ["pubApp"]
     *
     * @var string[]
     */
    public $pubApp;

    // 服务提供者数
    /**
     * @example 2
     *
     * @var int
     */
    public $pubCount;

    // 服务架构类型
    /**
     * @example DUBBO
     *
     * @var string
     */
    public $serviceType;

    // 消费者数
    /**
     * @example 3
     *
     * @var int
     */
    public $subCount;

    // 应用元数据
    /**
     * @example
     *
     * @var AppMetaDataModel[]
     */
    public $appInfos;
    protected $_name = [
        'dataId'      => 'data_id',
        'pubApp'      => 'pub_app',
        'pubCount'    => 'pub_count',
        'serviceType' => 'service_type',
        'subCount'    => 'sub_count',
        'appInfos'    => 'app_infos',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->pubApp) {
            $res['pub_app'] = $this->pubApp;
        }
        if (null !== $this->pubCount) {
            $res['pub_count'] = $this->pubCount;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }
        if (null !== $this->subCount) {
            $res['sub_count'] = $this->subCount;
        }
        if (null !== $this->appInfos) {
            $res['app_infos'] = [];
            if (null !== $this->appInfos && \is_array($this->appInfos)) {
                $n = 0;
                foreach ($this->appInfos as $item) {
                    $res['app_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SimpleServiceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['pub_app'])) {
            if (!empty($map['pub_app'])) {
                $model->pubApp = $map['pub_app'];
            }
        }
        if (isset($map['pub_count'])) {
            $model->pubCount = $map['pub_count'];
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }
        if (isset($map['sub_count'])) {
            $model->subCount = $map['sub_count'];
        }
        if (isset($map['app_infos'])) {
            if (!empty($map['app_infos'])) {
                $model->appInfos = [];
                $n               = 0;
                foreach ($map['app_infos'] as $item) {
                    $model->appInfos[$n++] = null !== $item ? AppMetaDataModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
