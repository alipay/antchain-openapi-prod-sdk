<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class FormParam extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $ossAccessKeyId;

    /**
     * @example
     *
     * @var string
     */
    public $callback;

    /**
     * @example
     *
     * @var string
     */
    public $key;

    /**
     * @example
     *
     * @var string
     */
    public $policy;

    /**
     * @example
     *
     * @var string
     */
    public $signature;

    /**
     * @example
     *
     * @var string
     */
    public $successActionStatus;

    /**
     * @example
     *
     * @var string
     */
    public $appName;
    protected $_name = [
        'ossAccessKeyId'      => 'oss_access_key_id',
        'callback'            => 'callback',
        'key'                 => 'key',
        'policy'              => 'policy',
        'signature'           => 'signature',
        'successActionStatus' => 'success_action_status',
        'appName'             => 'app_name',
    ];

    public function validate()
    {
        Model::validateRequired('ossAccessKeyId', $this->ossAccessKeyId, true);
        Model::validateRequired('callback', $this->callback, true);
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('policy', $this->policy, true);
        Model::validateRequired('signature', $this->signature, true);
        Model::validateRequired('successActionStatus', $this->successActionStatus, true);
        Model::validateRequired('appName', $this->appName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ossAccessKeyId) {
            $res['oss_access_key_id'] = $this->ossAccessKeyId;
        }
        if (null !== $this->callback) {
            $res['callback'] = $this->callback;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->policy) {
            $res['policy'] = $this->policy;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->successActionStatus) {
            $res['success_action_status'] = $this->successActionStatus;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FormParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['oss_access_key_id'])) {
            $model->ossAccessKeyId = $map['oss_access_key_id'];
        }
        if (isset($map['callback'])) {
            $model->callback = $map['callback'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['policy'])) {
            $model->policy = $map['policy'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['success_action_status'])) {
            $model->successActionStatus = $map['success_action_status'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }

        return $model;
    }
}
