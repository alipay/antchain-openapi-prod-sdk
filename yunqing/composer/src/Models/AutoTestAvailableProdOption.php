<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class AutoTestAvailableProdOption extends Model
{
    // 是否可执行测试用例
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isRunnable;

    // 不能执行自动化测试用例的原因
    //
    /**
     * @example 产品没有配备自动化测试镜像
     *
     * @var string
     */
    public $message;

    // 部署单元唯一标识（元数据）
    //
    /**
     * @example default
     *
     * @var string
     */
    public $deploymentUnitIdentity;

    // 部署单元实例唯一标识
    /**
     * @example default
     *
     * @var string
     */
    public $identity;

    // 产品码
    /**
     * @example IAM
     *
     * @var string
     */
    public $prodCode;
    protected $_name = [
        'isRunnable'             => 'is_runnable',
        'message'                => 'message',
        'deploymentUnitIdentity' => 'deployment_unit_identity',
        'identity'               => 'identity',
        'prodCode'               => 'prod_code',
    ];

    public function validate()
    {
        Model::validateRequired('isRunnable', $this->isRunnable, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('deploymentUnitIdentity', $this->deploymentUnitIdentity, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->isRunnable) {
            $res['is_runnable'] = $this->isRunnable;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->deploymentUnitIdentity) {
            $res['deployment_unit_identity'] = $this->deploymentUnitIdentity;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AutoTestAvailableProdOption
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['is_runnable'])) {
            $model->isRunnable = $map['is_runnable'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['deployment_unit_identity'])) {
            $model->deploymentUnitIdentity = $map['deployment_unit_identity'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }

        return $model;
    }
}
