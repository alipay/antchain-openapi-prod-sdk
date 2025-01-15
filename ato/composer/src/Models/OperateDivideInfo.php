<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OperateDivideInfo extends Model
{
    // 当前用户履约的租期编号
    /**
     * @example 1
     *
     * @var int
     */
    public $periodNum;

    // 经营分账收入方结果信息
    /**
     * @example
     *
     * @var OperationDivideTransInDetailInfo[]
     */
    public $operationDivideTransInList;
    protected $_name = [
        'periodNum'                  => 'period_num',
        'operationDivideTransInList' => 'operation_divide_trans_in_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->periodNum) {
            $res['period_num'] = $this->periodNum;
        }
        if (null !== $this->operationDivideTransInList) {
            $res['operation_divide_trans_in_list'] = [];
            if (null !== $this->operationDivideTransInList && \is_array($this->operationDivideTransInList)) {
                $n = 0;
                foreach ($this->operationDivideTransInList as $item) {
                    $res['operation_divide_trans_in_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateDivideInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['period_num'])) {
            $model->periodNum = $map['period_num'];
        }
        if (isset($map['operation_divide_trans_in_list'])) {
            if (!empty($map['operation_divide_trans_in_list'])) {
                $model->operationDivideTransInList = [];
                $n                                 = 0;
                foreach ($map['operation_divide_trans_in_list'] as $item) {
                    $model->operationDivideTransInList[$n++] = null !== $item ? OperationDivideTransInDetailInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
