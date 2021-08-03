<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class ListCpfSourceResponse extends Model
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

    // 商业机构公积金中心列表查询结果
    /**
     * @var TdmCpfProvinceVO[]
     */
    public $cpfList;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'cpfList'    => 'cpf_list',
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
        if (null !== $this->cpfList) {
            $res['cpf_list'] = [];
            if (null !== $this->cpfList && \is_array($this->cpfList)) {
                $n = 0;
                foreach ($this->cpfList as $item) {
                    $res['cpf_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListCpfSourceResponse
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
        if (isset($map['cpf_list'])) {
            if (!empty($map['cpf_list'])) {
                $model->cpfList = [];
                $n              = 0;
                foreach ($map['cpf_list'] as $item) {
                    $model->cpfList[$n++] = null !== $item ? TdmCpfProvinceVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
