<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAAS_MIDWAY\Models;

use AlibabaCloud\Tea\Model;

class BlockchainInfo extends Model
{
    // 链节点ID
    /**
     * @example M211026055921
     *
     * @var string
     */
    public $bizId;

    // 区块链名称
    /**
     * @example 标准合约链
     *
     * @var string
     */
    public $blockchainName;

    // 当前链如果为主链，该字段为空；否则该字段为子链对应的主链ID
    /**
     * @example M211023020849
     *
     * @var string
     */
    public $parentBizId;
    protected $_name = [
        'bizId'          => 'biz_id',
        'blockchainName' => 'blockchain_name',
        'parentBizId'    => 'parent_biz_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('blockchainName', $this->blockchainName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->blockchainName) {
            $res['blockchain_name'] = $this->blockchainName;
        }
        if (null !== $this->parentBizId) {
            $res['parent_biz_id'] = $this->parentBizId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BlockchainInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['blockchain_name'])) {
            $model->blockchainName = $map['blockchain_name'];
        }
        if (isset($map['parent_biz_id'])) {
            $model->parentBizId = $map['parent_biz_id'];
        }

        return $model;
    }
}
