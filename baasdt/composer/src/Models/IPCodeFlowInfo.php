<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPCodeFlowInfo extends Model
{
    // 拥有用户名称，收藏人
    /**
     * @example 小王
     *
     * @var string
     */
    public $codeOwnerName;

    // 收藏时间
    /**
     * @example 56783872489327492
     *
     * @var int
     */
    public $codeCollectTime;

    // 收藏交易哈希
    /**
     * @example dhjysgfhjdsgfhsjguyew7373yuetyudgysadg
     *
     * @var string
     */
    public $codeTransHash;

    // 收藏交易块高
    /**
     * @example 块高
     *
     * @var int
     */
    public $codeTransBlockNumber;

    // 流转信息jsonstring
    /**
     * @example 流转信息jsonstring
     *
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'codeOwnerName'        => 'code_owner_name',
        'codeCollectTime'      => 'code_collect_time',
        'codeTransHash'        => 'code_trans_hash',
        'codeTransBlockNumber' => 'code_trans_block_number',
        'extInfo'              => 'ext_info',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->codeOwnerName) {
            $res['code_owner_name'] = $this->codeOwnerName;
        }
        if (null !== $this->codeCollectTime) {
            $res['code_collect_time'] = $this->codeCollectTime;
        }
        if (null !== $this->codeTransHash) {
            $res['code_trans_hash'] = $this->codeTransHash;
        }
        if (null !== $this->codeTransBlockNumber) {
            $res['code_trans_block_number'] = $this->codeTransBlockNumber;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPCodeFlowInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code_owner_name'])) {
            $model->codeOwnerName = $map['code_owner_name'];
        }
        if (isset($map['code_collect_time'])) {
            $model->codeCollectTime = $map['code_collect_time'];
        }
        if (isset($map['code_trans_hash'])) {
            $model->codeTransHash = $map['code_trans_hash'];
        }
        if (isset($map['code_trans_block_number'])) {
            $model->codeTransBlockNumber = $map['code_trans_block_number'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
