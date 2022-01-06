<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ListDssIdcResponse extends Model
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

    /**
     * @var Idc[]
     */
    public $idcs;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'idcs'       => 'idcs',
    ];

    public function validate()
    {
        Model::validateRequired('idcs', $this->idcs, true);
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
        if (null !== $this->idcs) {
            $res['idcs'] = [];
            if (null !== $this->idcs && \is_array($this->idcs)) {
                $n = 0;
                foreach ($this->idcs as $item) {
                    $res['idcs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListDssIdcResponse
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
        if (isset($map['idcs'])) {
            if (!empty($map['idcs'])) {
                $model->idcs = [];
                $n           = 0;
                foreach ($map['idcs'] as $item) {
                    $model->idcs[$n++] = null !== $item ? Idc::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
