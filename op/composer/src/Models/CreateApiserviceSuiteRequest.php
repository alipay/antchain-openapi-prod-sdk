<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class CreateApiserviceSuiteRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 默认为1.0.0
    /**
     * @var string
     */
    public $suiteVersion;

    // 所属产品名
    /**
     * @var string
     */
    public $providerName;

    // 是否已经发布
    /**
     * @var bool
     */
    public $released;
    protected $_name = [
        'authToken'    => 'auth_token',
        'suiteVersion' => 'suite_version',
        'providerName' => 'provider_name',
        'released'     => 'released',
    ];

    public function validate()
    {
        Model::validateRequired('providerName', $this->providerName, true);
        Model::validateRequired('released', $this->released, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->suiteVersion) {
            $res['suite_version'] = $this->suiteVersion;
        }
        if (null !== $this->providerName) {
            $res['provider_name'] = $this->providerName;
        }
        if (null !== $this->released) {
            $res['released'] = $this->released;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateApiserviceSuiteRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['suite_version'])) {
            $model->suiteVersion = $map['suite_version'];
        }
        if (isset($map['provider_name'])) {
            $model->providerName = $map['provider_name'];
        }
        if (isset($map['released'])) {
            $model->released = $map['released'];
        }

        return $model;
    }
}
