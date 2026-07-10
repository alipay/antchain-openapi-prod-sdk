<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class MonitorProviderCapability extends Model
{
    // 供应商id
    /**
     * @example GOODEYE
     *
     * @var string
     */
    public $providerId;

    // 供应商名称
    /**
     * @example 千里眼
     *
     * @var string
     */
    public $providerName;

    // 供应商描述
    /**
     * @example 描述
     *
     * @var string
     */
    public $providerDescription;

    // 是否推荐供应商
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isProvided;
    protected $_name = [
        'providerId'          => 'provider_id',
        'providerName'        => 'provider_name',
        'providerDescription' => 'provider_description',
        'isProvided'          => 'is_provided',
    ];

    public function validate()
    {
        Model::validateRequired('providerId', $this->providerId, true);
        Model::validateRequired('providerName', $this->providerName, true);
        Model::validateRequired('providerDescription', $this->providerDescription, true);
        Model::validateRequired('isProvided', $this->isProvided, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->providerName) {
            $res['provider_name'] = $this->providerName;
        }
        if (null !== $this->providerDescription) {
            $res['provider_description'] = $this->providerDescription;
        }
        if (null !== $this->isProvided) {
            $res['is_provided'] = $this->isProvided;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MonitorProviderCapability
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['provider_name'])) {
            $model->providerName = $map['provider_name'];
        }
        if (isset($map['provider_description'])) {
            $model->providerDescription = $map['provider_description'];
        }
        if (isset($map['is_provided'])) {
            $model->isProvided = $map['is_provided'];
        }

        return $model;
    }
}
