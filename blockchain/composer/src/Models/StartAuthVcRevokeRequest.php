<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAuthVcRevokeRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 在type参数为1时，此did参数不需要传递，默认调用方吊销给用户颁发的卡证。
    /**
     * @var string
     */
    public $did;

    // 类型说明，1：机构给用户颁发的证书，2：用户授权机构的证书(需要用户授权)
    /**
     * @var int
     */
    public $type;

    // 吊销的目标可验证声明ID，如果type参数为1时，此参数可以默认不传，授权宝将会找到目标user当前持有的有效卡证，进行吊销处理。
    // 当type不为1时，此参数也可以不传，此时授权宝会根据userInfo和did信息去找到一个可吊销的VC进行吊销（应用层慎重使用，确保这样筛选的目标唯一性）。
    /**
     * @var string
     */
    public $vcId;

    // 当type参数为1时，此参数和did参数，两者选一个使用，使用userId或者did参数指明did，代表的都是目标C类用户身份。
    // 当type不为1时，此参数代表C类用户身份，did参数指明授权的目标机构身份。
    //
    /**
     * @var string
     */
    public $userInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'type'              => 'type',
        'vcId'              => 'vc_id',
        'userInfo'          => 'user_info',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }
        if (null !== $this->userInfo) {
            $res['user_info'] = $this->userInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAuthVcRevokeRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }
        if (isset($map['user_info'])) {
            $model->userInfo = $map['user_info'];
        }

        return $model;
    }
}
