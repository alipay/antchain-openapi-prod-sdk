<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QuerySpuListResponse extends Model
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

    // SPU信息
    /**
     * @var SimSpuInfo[]
     */
    public $spuInfoList;

    // 分页参数
    /**
     * @var Paginator
     */
    public $paginator;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'spuInfoList' => 'spu_info_list',
        'paginator'   => 'paginator',
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
        if (null !== $this->spuInfoList) {
            $res['spu_info_list'] = [];
            if (null !== $this->spuInfoList && \is_array($this->spuInfoList)) {
                $n = 0;
                foreach ($this->spuInfoList as $item) {
                    $res['spu_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->paginator) {
            $res['paginator'] = null !== $this->paginator ? $this->paginator->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySpuListResponse
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
        if (isset($map['spu_info_list'])) {
            if (!empty($map['spu_info_list'])) {
                $model->spuInfoList = [];
                $n                  = 0;
                foreach ($map['spu_info_list'] as $item) {
                    $model->spuInfoList[$n++] = null !== $item ? SimSpuInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['paginator'])) {
            $model->paginator = Paginator::fromMap($map['paginator']);
        }

        return $model;
    }
}
