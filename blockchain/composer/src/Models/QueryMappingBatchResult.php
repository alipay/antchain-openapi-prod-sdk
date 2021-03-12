<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryMappingBatchResult extends Model
{
    // 本次查询获取的账户信息
    /**
     * @example
     *
     * @var AccountMappingInfo[]
     */
    public $accounts;

    // 该商户下总共映射账户的数量
    /**
     * @example 200
     *
     * @var int
     */
    public $totalNum;

    // 该商户下账户信息的总页数
    /**
     * @example 10
     *
     * @var int
     */
    public $totalPage;
    protected $_name = [
        'accounts'  => 'accounts',
        'totalNum'  => 'total_num',
        'totalPage' => 'total_page',
    ];

    public function validate()
    {
        Model::validateRequired('accounts', $this->accounts, true);
        Model::validateRequired('totalNum', $this->totalNum, true);
        Model::validateRequired('totalPage', $this->totalPage, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accounts) {
            $res['accounts'] = [];
            if (null !== $this->accounts && \is_array($this->accounts)) {
                $n = 0;
                foreach ($this->accounts as $item) {
                    $res['accounts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalNum) {
            $res['total_num'] = $this->totalNum;
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMappingBatchResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['accounts'])) {
            if (!empty($map['accounts'])) {
                $model->accounts = [];
                $n               = 0;
                foreach ($map['accounts'] as $item) {
                    $model->accounts[$n++] = null !== $item ? AccountMappingInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_num'])) {
            $model->totalNum = $map['total_num'];
        }
        if (isset($map['total_page'])) {
            $model->totalPage = $map['total_page'];
        }

        return $model;
    }
}
