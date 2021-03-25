<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BAASDT\Models\APIWhiteListInfo;

class QueryAasAntdaoBlockanalysisWhitelistResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'whiteList' => 'white_list',
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
        if (null !== $this->whiteList) {
            $res['white_list'] = [];
            if(null !== $this->whiteList && is_array($this->whiteList)){
                $n = 0;
                foreach($this->whiteList as $item){
                    $res['white_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAasAntdaoBlockanalysisWhitelistResponse
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
        if(isset($map['white_list'])){
            if(!empty($map['white_list'])){
                $model->whiteList = [];
                $n = 0;
                foreach($map['white_list'] as $item) {
                    $model->whiteList[$n++] = null !== $item ? APIWhiteListInfo::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 接口白名单信息
    /**
     * @var array
     */
    public $whiteList;

}
