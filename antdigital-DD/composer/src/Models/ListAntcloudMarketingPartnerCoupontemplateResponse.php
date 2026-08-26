<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\ChannelTemplateInfo;

class ListAntcloudMarketingPartnerCoupontemplateResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
        'totalCount' => 'total_count',
        'templates' => 'templates',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->templates) {
            $res['templates'] = [];
            if(null !== $this->templates && is_array($this->templates)){
                $n = 0;
                foreach($this->templates as $item){
                    $res['templates'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListAntcloudMarketingPartnerCoupontemplateResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['page_no'])){
            $model->pageNo = $map['page_no'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['total_count'])){
            $model->totalCount = $map['total_count'];
        }
        if(isset($map['templates'])){
            if(!empty($map['templates'])){
                $model->templates = [];
                $n = 0;
                foreach($map['templates'] as $item) {
                    $model->templates[$n++] = null !== $item ? ChannelTemplateInfo::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
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

    // 分页查询的页码
    /**
     * @var int
     */
    public $pageNo;

    // 分页查询每页展示的数量
    /**
     * @var int
     */
    public $pageSize;

    // 查询出来的总模板数量
    /**
     * @var int
     */
    public $totalCount;

    // 优惠券模板信息
    /**
     * @var ChannelTemplateInfo[]
     */
    public $templates;

}
