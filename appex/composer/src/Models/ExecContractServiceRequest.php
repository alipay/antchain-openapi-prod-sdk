<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class ExecContractServiceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 应用did
    /**
     * @var string
     */
    public $appDid;

    // 合约方法名
    /**
     * @var string
     */
    public $contractMethod;

    // 合约名称，当一个应用有多个合约时需要传入
    /**
     * @var string
     */
    public $contractName;

    // 1.同步交易，2.异步交易，3.Local
    // 如果不理解以上交易方式之间的区别请不要传入该参数，默认为同步交易
    /**
     * @var int
     */
    public $execType;

    // 合约入参（格式为json）
    /**
     * @var string
     */
    public $requestBody;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appDid'            => 'app_did',
        'contractMethod'    => 'contract_method',
        'contractName'      => 'contract_name',
        'execType'          => 'exec_type',
        'requestBody'       => 'request_body',
    ];

    public function validate()
    {
        Model::validateRequired('appDid', $this->appDid, true);
        Model::validateRequired('contractMethod', $this->contractMethod, true);
        Model::validateRequired('requestBody', $this->requestBody, true);
        Model::validateMaxLength('appDid', $this->appDid, 128);
        Model::validateMaxLength('contractMethod', $this->contractMethod, 128);
        Model::validateMaxLength('contractName', $this->contractName, 128);
        Model::validateMaxLength('requestBody', $this->requestBody, 1024);
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
        if (null !== $this->appDid) {
            $res['app_did'] = $this->appDid;
        }
        if (null !== $this->contractMethod) {
            $res['contract_method'] = $this->contractMethod;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->execType) {
            $res['exec_type'] = $this->execType;
        }
        if (null !== $this->requestBody) {
            $res['request_body'] = $this->requestBody;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecContractServiceRequest
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
        if (isset($map['app_did'])) {
            $model->appDid = $map['app_did'];
        }
        if (isset($map['contract_method'])) {
            $model->contractMethod = $map['contract_method'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['exec_type'])) {
            $model->execType = $map['exec_type'];
        }
        if (isset($map['request_body'])) {
            $model->requestBody = $map['request_body'];
        }

        return $model;
    }
}
