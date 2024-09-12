<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\UNITYCS\Models;

use AlibabaCloud\Tea\Model;

class VerifyDataResponse extends Model
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

    // 核验结果
    /**
     * @var bool
     */
    public $result;

    // 数据标识
    /**
     * @var string
     */
    public $attrIdentify;

    // 区块高度
    /**
     * @var int
     */
    public $blockCount;

    // 核验属性集合
    /**
     * @var MetaDataAttr[]
     */
    public $attrs;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'result'       => 'result',
        'attrIdentify' => 'attr_identify',
        'blockCount'   => 'block_count',
        'attrs'        => 'attrs',
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
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->attrIdentify) {
            $res['attr_identify'] = $this->attrIdentify;
        }
        if (null !== $this->blockCount) {
            $res['block_count'] = $this->blockCount;
        }
        if (null !== $this->attrs) {
            $res['attrs'] = [];
            if (null !== $this->attrs && \is_array($this->attrs)) {
                $n = 0;
                foreach ($this->attrs as $item) {
                    $res['attrs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyDataResponse
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
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['attr_identify'])) {
            $model->attrIdentify = $map['attr_identify'];
        }
        if (isset($map['block_count'])) {
            $model->blockCount = $map['block_count'];
        }
        if (isset($map['attrs'])) {
            if (!empty($map['attrs'])) {
                $model->attrs = [];
                $n            = 0;
                foreach ($map['attrs'] as $item) {
                    $model->attrs[$n++] = null !== $item ? MetaDataAttr::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
