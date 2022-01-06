<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AllDrmDrmldccellsResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 是否是LDC
    /**
     * @var bool
     */
    public $isLdc;

    // 如果不是LDC返回cells名称列表
    /**
     * @var string[]
     */
    public $oldCells;

    // 如果是LDC单元反回name和type信息
    /**
     * @var CellLdcInfo[]
     */
    public $newCells;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'isLdc'      => 'is_ldc',
        'oldCells'   => 'old_cells',
        'newCells'   => 'new_cells',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->isLdc) {
            $res['is_ldc'] = $this->isLdc;
        }
        if (null !== $this->oldCells) {
            $res['old_cells'] = $this->oldCells;
        }
        if (null !== $this->newCells) {
            $res['new_cells'] = [];
            if (null !== $this->newCells && \is_array($this->newCells)) {
                $n = 0;
                foreach ($this->newCells as $item) {
                    $res['new_cells'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AllDrmDrmldccellsResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['is_ldc'])) {
            $model->isLdc = $map['is_ldc'];
        }
        if (isset($map['old_cells'])) {
            if (!empty($map['old_cells'])) {
                $model->oldCells = $map['old_cells'];
            }
        }
        if (isset($map['new_cells'])) {
            if (!empty($map['new_cells'])) {
                $model->newCells = [];
                $n               = 0;
                foreach ($map['new_cells'] as $item) {
                    $model->newCells[$n++] = null !== $item ? CellLdcInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
