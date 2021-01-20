<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class ReleaseComputerRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'computerIds' => 'computer_ids',
        'reqBizId' => 'req_biz_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->computerIds) {
            $res['computer_ids'] = $this->computerIds;
        }
        if (null !== $this->reqBizId) {
            $res['req_biz_id'] = $this->reqBizId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ReleaseComputerRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['computer_ids'])){
            if(!empty($map['computer_ids'])){
                $model->computerIds = $map['computer_ids'];
            }
        }
        if(isset($map['req_biz_id'])){
            $model->reqBizId = $map['req_biz_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 计算资源id，可以指定多个
    /**
     * @var string[]
     */
    public $computerIds;

    // 请求业务id，用于幂等性控制等，需要客户端提供并保证唯一。最大64位单字节字符
    /**
     * @var string
     */
    public $reqBizId;

}
