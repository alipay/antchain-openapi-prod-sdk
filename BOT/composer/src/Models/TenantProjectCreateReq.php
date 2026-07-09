<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class TenantProjectCreateReq extends Model
{
    // 业务类型，默认空
    /**
     * @example null
     *
     * @var string
     */
    public $bizType;

    // 可选的，项目关联的区块链类型，1/2/3代表存证/合约等类型
    /**
     * @example 1
     *
     * @var int
     */
    public $blockchainType;

    // 可选的，项目关联的区块链uid
    /**
     * @example 1111111
     *
     * @var string
     */
    public $blockchainUid;

    // 租户下唯一项目名称，用以标识项目聚合的存证等信息
    /**
     * @example "唯一项目名称"
     *
     * @var string
     */
    public $projectName;
    protected $_name = [
        'bizType'        => 'biz_type',
        'blockchainType' => 'blockchain_type',
        'blockchainUid'  => 'blockchain_uid',
        'projectName'    => 'project_name',
    ];

    public function validate()
    {
        Model::validateRequired('projectName', $this->projectName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->blockchainType) {
            $res['blockchain_type'] = $this->blockchainType;
        }
        if (null !== $this->blockchainUid) {
            $res['blockchain_uid'] = $this->blockchainUid;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TenantProjectCreateReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['blockchain_type'])) {
            $model->blockchainType = $map['blockchain_type'];
        }
        if (isset($map['blockchain_uid'])) {
            $model->blockchainUid = $map['blockchain_uid'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }

        return $model;
    }
}
