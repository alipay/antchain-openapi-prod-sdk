<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryRiskGeneralRequest extends Model
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

    // x
    /**
     * @var string
     */
    public $dataCode;

    // AES加密使用的随机数，对该随机数使用RaaS数据服务的公钥进行加密，随后传入；
    /**
     * @var string
     */
    public $encryptedNonce;

    // ISV的终端客户编码、征信机构的终端客户编码、公司内部部门ID，可以定制数据输出。
    /**
     * @var string
     */
    public $customerId;

    // 业务请求入参，兼容批量调用
    /**
     * @var BizQueryParam[]
     */
    public $bizQueryParams;

    // 拓展输入字段,
    /**
     * @var string
     */
    public $extData;

    // 用于标记是否获得用户授权。
    // 1:获得授权（默认）
    // 0:未获得授权
    /**
     * @var string
     */
    public $userAuthorization;

    // 默认AES128，后续可选SM2等国密
    /**
     * @var string
     */
    public $encryptMethod;

    // 整个包体加密，二选一
    /**
     * @var string
     */
    public $encryptedBody;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataCode'          => 'data_code',
        'encryptedNonce'    => 'encrypted_nonce',
        'customerId'        => 'customer_id',
        'bizQueryParams'    => 'biz_query_params',
        'extData'           => 'ext_data',
        'userAuthorization' => 'user_authorization',
        'encryptMethod'     => 'encrypt_method',
        'encryptedBody'     => 'encrypted_body',
    ];

    public function validate()
    {
        Model::validateRequired('dataCode', $this->dataCode, true);
        Model::validateRequired('encryptedNonce', $this->encryptedNonce, true);
        Model::validateRequired('bizQueryParams', $this->bizQueryParams, true);
        Model::validateRequired('userAuthorization', $this->userAuthorization, true);
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
        if (null !== $this->dataCode) {
            $res['data_code'] = $this->dataCode;
        }
        if (null !== $this->encryptedNonce) {
            $res['encrypted_nonce'] = $this->encryptedNonce;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->bizQueryParams) {
            $res['biz_query_params'] = [];
            if (null !== $this->bizQueryParams && \is_array($this->bizQueryParams)) {
                $n = 0;
                foreach ($this->bizQueryParams as $item) {
                    $res['biz_query_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extData) {
            $res['ext_data'] = $this->extData;
        }
        if (null !== $this->userAuthorization) {
            $res['user_authorization'] = $this->userAuthorization;
        }
        if (null !== $this->encryptMethod) {
            $res['encrypt_method'] = $this->encryptMethod;
        }
        if (null !== $this->encryptedBody) {
            $res['encrypted_body'] = $this->encryptedBody;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRiskGeneralRequest
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
        if (isset($map['data_code'])) {
            $model->dataCode = $map['data_code'];
        }
        if (isset($map['encrypted_nonce'])) {
            $model->encryptedNonce = $map['encrypted_nonce'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['biz_query_params'])) {
            if (!empty($map['biz_query_params'])) {
                $model->bizQueryParams = [];
                $n                     = 0;
                foreach ($map['biz_query_params'] as $item) {
                    $model->bizQueryParams[$n++] = null !== $item ? BizQueryParam::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ext_data'])) {
            $model->extData = $map['ext_data'];
        }
        if (isset($map['user_authorization'])) {
            $model->userAuthorization = $map['user_authorization'];
        }
        if (isset($map['encrypt_method'])) {
            $model->encryptMethod = $map['encrypt_method'];
        }
        if (isset($map['encrypted_body'])) {
            $model->encryptedBody = $map['encrypted_body'];
        }

        return $model;
    }
}
