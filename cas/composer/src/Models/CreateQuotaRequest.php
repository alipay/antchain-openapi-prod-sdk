<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateQuotaRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 维度标记
    /**
     * @var string
     */
    public $dimIdentity;

    // resource
    /**
     * @var string
     */
    public $resource;

    // 额度值，实际值还需要乘上quota_factor
    /**
     * @var int
     */
    public $hardLimit;

    // 同步资源用
    /**
     * @var string
     */
    public $syncInterface;

    // 关于配额的描述信息
    /**
     * @var string
     */
    public $quotaDesc;

    // 由于OP不支持浮点数，请用字符串表示浮点数，比如”0.1“-带双引号
    /**
     * @var string
     */
    public $quotaFactor;
    protected $_name = [
        'authToken'     => 'auth_token',
        'dimIdentity'   => 'dim_identity',
        'resource'      => 'resource',
        'hardLimit'     => 'hard_limit',
        'syncInterface' => 'sync_interface',
        'quotaDesc'     => 'quota_desc',
        'quotaFactor'   => 'quota_factor',
    ];

    public function validate()
    {
        Model::validateRequired('dimIdentity', $this->dimIdentity, true);
        Model::validateRequired('resource', $this->resource, true);
        Model::validateRequired('hardLimit', $this->hardLimit, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->dimIdentity) {
            $res['dim_identity'] = $this->dimIdentity;
        }
        if (null !== $this->resource) {
            $res['resource'] = $this->resource;
        }
        if (null !== $this->hardLimit) {
            $res['hard_limit'] = $this->hardLimit;
        }
        if (null !== $this->syncInterface) {
            $res['sync_interface'] = $this->syncInterface;
        }
        if (null !== $this->quotaDesc) {
            $res['quota_desc'] = $this->quotaDesc;
        }
        if (null !== $this->quotaFactor) {
            $res['quota_factor'] = $this->quotaFactor;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateQuotaRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['dim_identity'])) {
            $model->dimIdentity = $map['dim_identity'];
        }
        if (isset($map['resource'])) {
            $model->resource = $map['resource'];
        }
        if (isset($map['hard_limit'])) {
            $model->hardLimit = $map['hard_limit'];
        }
        if (isset($map['sync_interface'])) {
            $model->syncInterface = $map['sync_interface'];
        }
        if (isset($map['quota_desc'])) {
            $model->quotaDesc = $map['quota_desc'];
        }
        if (isset($map['quota_factor'])) {
            $model->quotaFactor = $map['quota_factor'];
        }

        return $model;
    }
}
