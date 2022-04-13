<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class OpsApplication extends Model
{
    // 应用名称
    /**
     * @example
     *
     * @var string
     */
    public $name;

    // 应用发布版本（部分运维操作可能不包含版本信息，为null）
    /**
     * @example
     *
     * @var string
     */
    public $version;

    // 应用（服务）当前运维状态。取值列表： INITING：初始化中； INIT_FAILED：初始化失败； INITED：初始化完成； EXECUTING：执行中； SUCCESS：执行成功； FAILED：执行失败； ROLLBACKED：已回滚； CANCELED：已取消
    /**
     * @example
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'name'    => 'name',
        'version' => 'version',
        'status'  => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsApplication
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
