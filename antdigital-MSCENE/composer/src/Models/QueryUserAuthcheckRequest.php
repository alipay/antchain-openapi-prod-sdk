<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\MSCENE\Models;

use AlibabaCloud\Tea\Model;

class QueryUserAuthcheckRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'miniProgramId' => 'mini_program_id',
        'platformId' => 'platform_id',
        'token' => 'token',
        'openUid' => 'open_uid',
    ];
    public function validate() {
        Model::validateRequired('miniProgramId', $this->miniProgramId, true);
        Model::validateRequired('platformId', $this->platformId, true);
        Model::validateRequired('token', $this->token, true);
        Model::validateRequired('openUid', $this->openUid, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->miniProgramId) {
            $res['mini_program_id'] = $this->miniProgramId;
        }
        if (null !== $this->platformId) {
            $res['platform_id'] = $this->platformId;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->openUid) {
            $res['open_uid'] = $this->openUid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryUserAuthcheckRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['mini_program_id'])){
            $model->miniProgramId = $map['mini_program_id'];
        }
        if(isset($map['platform_id'])){
            $model->platformId = $map['platform_id'];
        }
        if(isset($map['token'])){
            $model->token = $map['token'];
        }
        if(isset($map['open_uid'])){
            $model->openUid = $map['open_uid'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 小游戏ID
    /**
     * @var string
     */
    public $miniProgramId;

    // 平台ID
    /**
     * @var string
     */
    public $platformId;

    // 用户身份认证令牌
    /**
     * @var string
     */
    public $token;

    // 开放用户ID
    /**
     * @var string
     */
    public $openUid;

}
