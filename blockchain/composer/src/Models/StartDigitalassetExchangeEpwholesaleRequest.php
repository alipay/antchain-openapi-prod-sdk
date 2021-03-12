<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDigitalassetExchangeEpwholesaleRequest extends Model
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

    // 批发账户信息列表
    /**
     * @var AccountWholesaleParam[]
     */
    public $accountList;

    // 版通代码
    /**
     * @var string
     */
    public $epCode;

    // 版通发行方账户
    /**
     * @var string
     */
    public $epIssueAccount;

    // 交易所代码
    /**
     * @var string
     */
    public $exchangeCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accountList'       => 'account_list',
        'epCode'            => 'ep_code',
        'epIssueAccount'    => 'ep_issue_account',
        'exchangeCode'      => 'exchange_code',
    ];

    public function validate()
    {
        Model::validateRequired('accountList', $this->accountList, true);
        Model::validateRequired('epCode', $this->epCode, true);
        Model::validateRequired('epIssueAccount', $this->epIssueAccount, true);
        Model::validateRequired('exchangeCode', $this->exchangeCode, true);
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
        if (null !== $this->accountList) {
            $res['account_list'] = [];
            if (null !== $this->accountList && \is_array($this->accountList)) {
                $n = 0;
                foreach ($this->accountList as $item) {
                    $res['account_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->epCode) {
            $res['ep_code'] = $this->epCode;
        }
        if (null !== $this->epIssueAccount) {
            $res['ep_issue_account'] = $this->epIssueAccount;
        }
        if (null !== $this->exchangeCode) {
            $res['exchange_code'] = $this->exchangeCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDigitalassetExchangeEpwholesaleRequest
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
        if (isset($map['account_list'])) {
            if (!empty($map['account_list'])) {
                $model->accountList = [];
                $n                  = 0;
                foreach ($map['account_list'] as $item) {
                    $model->accountList[$n++] = null !== $item ? AccountWholesaleParam::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ep_code'])) {
            $model->epCode = $map['ep_code'];
        }
        if (isset($map['ep_issue_account'])) {
            $model->epIssueAccount = $map['ep_issue_account'];
        }
        if (isset($map['exchange_code'])) {
            $model->exchangeCode = $map['exchange_code'];
        }

        return $model;
    }
}
