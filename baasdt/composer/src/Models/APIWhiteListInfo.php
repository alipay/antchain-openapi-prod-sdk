<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class APIWhiteListInfo extends Model
{
    // 租户ID
    /**
     * @example OKIJUHYG
     *
     * @var string
     */
    public $tenantId;

    // 链ID
    /**
     * @example antdao
     *
     * @var string
     */
    public $chainId;

    // 权限级别，暂时不用
    /**
     * @example 0
     *
     * @var int
     */
    public $level;

    // 更新时间
    /**
     * @example 20200425204555
     *
     * @var string
     */
    public $updateTime;

    // 扩展字段
    /**
     * @example extension
     *
     * @var string
     */
    public $extension;
    protected $_name = [
        'tenantId'   => 'tenant_id',
        'chainId'    => 'chain_id',
        'level'      => 'level',
        'updateTime' => 'update_time',
        'extension'  => 'extension',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('level', $this->level, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
        Model::validateRequired('extension', $this->extension, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return APIWhiteListInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }

        return $model;
    }
}
