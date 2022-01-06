<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ServiceRelation extends Model
{
    // 应用名
    /**
     * @example consumer-demo
     *
     * @var string
     */
    public $appName;

    // 服务id
    /**
     * @example com.alipay.antcloud.drmdata.facade.DrmDataClusterFacade
     *
     * @var string
     */
    public $dataId;
    protected $_name = [
        'appName' => 'app_name',
        'dataId'  => 'data_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServiceRelation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }

        return $model;
    }
}
