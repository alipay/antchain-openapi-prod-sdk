<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class ClueInformationReq extends Model
{
    // 线索标题
    /**
     * @example 标题
     *
     * @var string
     */
    public $title;

    // 线索跟进状态   INIT:待确认 CONTACTED:跟进中 CLOSED:线索终止 TRANSFER:已转交 BUSINESS:转商机
    /**
     * @example  INIT
     *
     * @var string
     */
    public $status;

    // 线索跟进人  工号
    /**
     * @example 123132
     *
     * @var string
     */
    public $createdUserNick;

    // 线索描述
    /**
     * @example 线索描述
     *
     * @var string
     */
    public $description;

    // 客户名称
    /**
     * @example XXX公司
     *
     * @var string
     */
    public $customerName;

    // 业务线
    /**
     * @example XXX
     *
     * @var string
     */
    public $bizLine;

    // 客户地址
    /**
     * @example XX省XX市XX区XXX
     *
     * @var string
     */
    public $customerLocation;

    // 公司联系人
    /**
     * @example {           "jobTitle": "经理",           "realName": "张三",           "mobilePhone": "15888888888",           "email": "lisi@lisi.com"         }
     *
     * @var CorporateContacts[]
     */
    public $corporateContacts;

    // 客户所在行业
    /**
     * @example 金融
     *
     * @var string
     */
    public $customerIndustry;

    // 客户营收规模
    /**
     * @example
     *
     * @var string
     */
    public $revenueScale;

    // 社会信用代码
    /**
     * @example 914XXXXXXXXXXXXXXX
     *
     * @var string
     */
    public $socialCreditCode;

    // 线索来源
    /**
     * @example LAOJIAO
     *
     * @var string
     */
    public $source;

    // 客户ID
    /**
     * @example 203434343
     *
     * @var string
     */
    public $customerId;

    // 多租户模型。线索服务化的租户模型。请联系线索服务管理员提供。固定值。
    /**
     * @example BCC
     *
     * @var string
     */
    public $tenant;
    protected $_name = [
        'title'             => 'title',
        'status'            => 'status',
        'createdUserNick'   => 'created_user_nick',
        'description'       => 'description',
        'customerName'      => 'customer_name',
        'bizLine'           => 'biz_line',
        'customerLocation'  => 'customer_location',
        'corporateContacts' => 'corporate_contacts',
        'customerIndustry'  => 'customer_industry',
        'revenueScale'      => 'revenue_scale',
        'socialCreditCode'  => 'social_credit_code',
        'source'            => 'source',
        'customerId'        => 'customer_id',
        'tenant'            => 'tenant',
    ];

    public function validate()
    {
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('createdUserNick', $this->createdUserNick, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('customerName', $this->customerName, true);
        Model::validateRequired('bizLine', $this->bizLine, true);
        Model::validateRequired('customerLocation', $this->customerLocation, true);
        Model::validateRequired('customerIndustry', $this->customerIndustry, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('tenant', $this->tenant, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->createdUserNick) {
            $res['created_user_nick'] = $this->createdUserNick;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->customerName) {
            $res['customer_name'] = $this->customerName;
        }
        if (null !== $this->bizLine) {
            $res['biz_line'] = $this->bizLine;
        }
        if (null !== $this->customerLocation) {
            $res['customer_location'] = $this->customerLocation;
        }
        if (null !== $this->corporateContacts) {
            $res['corporate_contacts'] = [];
            if (null !== $this->corporateContacts && \is_array($this->corporateContacts)) {
                $n = 0;
                foreach ($this->corporateContacts as $item) {
                    $res['corporate_contacts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->customerIndustry) {
            $res['customer_industry'] = $this->customerIndustry;
        }
        if (null !== $this->revenueScale) {
            $res['revenue_scale'] = $this->revenueScale;
        }
        if (null !== $this->socialCreditCode) {
            $res['social_credit_code'] = $this->socialCreditCode;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClueInformationReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['created_user_nick'])) {
            $model->createdUserNick = $map['created_user_nick'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['customer_name'])) {
            $model->customerName = $map['customer_name'];
        }
        if (isset($map['biz_line'])) {
            $model->bizLine = $map['biz_line'];
        }
        if (isset($map['customer_location'])) {
            $model->customerLocation = $map['customer_location'];
        }
        if (isset($map['corporate_contacts'])) {
            if (!empty($map['corporate_contacts'])) {
                $model->corporateContacts = [];
                $n                        = 0;
                foreach ($map['corporate_contacts'] as $item) {
                    $model->corporateContacts[$n++] = null !== $item ? CorporateContacts::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['customer_industry'])) {
            $model->customerIndustry = $map['customer_industry'];
        }
        if (isset($map['revenue_scale'])) {
            $model->revenueScale = $map['revenue_scale'];
        }
        if (isset($map['social_credit_code'])) {
            $model->socialCreditCode = $map['social_credit_code'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }

        return $model;
    }
}
