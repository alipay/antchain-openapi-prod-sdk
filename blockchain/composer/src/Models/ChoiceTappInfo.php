<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ChoiceTappInfo extends Model
{
    // 选择的tapp的名字
    /**
     * @example erpDataReader-1
     *
     * @var string
     */
    public $tappName;

    // 版本号，如果不填就选择最新的版本
    /**
     * @example
     *
     * @var int
     */
    public $tappVersion;

    // 该tapp将被声明在did doc中的id
    /**
     * @example erpDataReader-1
     *
     * @var string
     */
    public $serviceId;
    protected $_name = [
        'tappName'    => 'tapp_name',
        'tappVersion' => 'tapp_version',
        'serviceId'   => 'service_id',
    ];

    public function validate()
    {
        Model::validateRequired('tappName', $this->tappName, true);
        Model::validateRequired('serviceId', $this->serviceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tappName) {
            $res['tapp_name'] = $this->tappName;
        }
        if (null !== $this->tappVersion) {
            $res['tapp_version'] = $this->tappVersion;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChoiceTappInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tapp_name'])) {
            $model->tappName = $map['tapp_name'];
        }
        if (isset($map['tapp_version'])) {
            $model->tappVersion = $map['tapp_version'];
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }

        return $model;
    }
}
